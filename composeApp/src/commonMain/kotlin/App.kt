import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.ImageLoader
import coil3.annotation.ExperimentalCoilApi
import coil3.compose.rememberAsyncImagePainter
import coil3.compose.setSingletonImageLoaderFactory
import coil3.fetch.NetworkFetcher
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import util.toComposeColor


@OptIn(ExperimentalCoilApi::class)
@Composable
fun App() {
    setSingletonImageLoaderFactory { context ->
        ImageLoader.Builder(context)
            .components {
                add(NetworkFetcher.Factory())
            }
            .build()
    }

    MaterialTheme {

        Scaffold(
            topBar = { TopAppBar(title = { Text("Coil 3 KMP Example") }) }
        ) {

            val userList = getUserList()

            LazyColumn(modifier = Modifier.padding(it)) {
                items(userList.size, key = { it }) {
                    val user = userList[it]
                    Row(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
                        Image(
                            painter = rememberAsyncImagePainter(user.url),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp).clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Spacer(Modifier.width(10.dp))

                        Column {
                            Text(text = user.name, fontSize = 16.sp)

                            Text(
                                text = user.title,
                                fontSize = 14.sp,
                                color = "#692a2a".toComposeColor()
                            )
                            Text(
                                text = Clock.System.now().toLocalDateTime(
                                    TimeZone.currentSystemDefault()).toString(),
                                fontSize = 14.sp,
                                color = "#692a2a".toComposeColor()
                            )

                        }
                    }
                }
            }

        }

    }
}