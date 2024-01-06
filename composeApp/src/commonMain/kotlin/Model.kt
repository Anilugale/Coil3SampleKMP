import io.ktor.http.Url


data class User(val name: String,val title:String, val url: String)

fun getUserList():ArrayList<User>{

    val list = arrayListOf<User>()

    list.add(User("Anil Ugale","Team Lead","https://media.licdn.com/dms/image/C5103AQHVvTuNdl3dhQ/profile-displayphoto-shrink_800_800/0/1515848157965?e=2147483647&v=beta&t=lwdjA5WktJHW-ADZ6C2xUFq0oKD4S_m-Lzhd8v_pnRg"))
    list.add(User("Yogesh Despande","Manager","https://vastutathastu.com/wp-content/uploads/photo-gallery/yogesh_desahpande.jpg?bwg=1641553276"))
    list.add(User("Akash Munde","Teammate","https://img.etimg.com/thumb/width-1600,height-900,imgsize-47368,resizemode-75,msid-104999679/news/sports/when-virat-kohli-battled-depression-his-coach-recalls-the-toughest-phase-of-the-cricketers-career.jpg"))
    list.add(User("Manpreet Gunga","Teammate","https://img.freepik.com/premium-photo/stylish-muslim-boy-with-glorious-punjabi-ai-generated_874192-2505.jpg"))
    list.add(User("Mitesh Naik","Teammate","https://pbs.twimg.com/media/FjU2lkcWYAgNG6d.jpg"))
    list.add(User("Anil Ugale","Team Lead","https://media.licdn.com/dms/image/C5103AQHVvTuNdl3dhQ/profile-displayphoto-shrink_800_800/0/1515848157965?e=2147483647&v=beta&t=lwdjA5WktJHW-ADZ6C2xUFq0oKD4S_m-Lzhd8v_pnRg"))
    list.add(User("Yogesh Despande","Manager","https://vastutathastu.com/wp-content/uploads/photo-gallery/yogesh_desahpande.jpg?bwg=1641553276"))
    list.add(User("Akash Munde","Teammate","https://img.etimg.com/thumb/width-1600,height-900,imgsize-47368,resizemode-75,msid-104999679/news/sports/when-virat-kohli-battled-depression-his-coach-recalls-the-toughest-phase-of-the-cricketers-career.jpg"))
    list.add(User("Manpreet Gunga","Teammate","https://img.freepik.com/premium-photo/stylish-muslim-boy-with-glorious-punjabi-ai-generated_874192-2505.jpg"))
    list.add(User("Mitesh Naik","Teammate","https://pbs.twimg.com/media/FjU2lkcWYAgNG6d.jpg"))

    list.add(User("Anil Ugale","Team Lead","https://media.licdn.com/dms/image/C5103AQHVvTuNdl3dhQ/profile-displayphoto-shrink_800_800/0/1515848157965?e=2147483647&v=beta&t=lwdjA5WktJHW-ADZ6C2xUFq0oKD4S_m-Lzhd8v_pnRg"))
    list.add(User("Yogesh Despande","Manager","https://vastutathastu.com/wp-content/uploads/photo-gallery/yogesh_desahpande.jpg?bwg=1641553276"))
    list.add(User("Akash Munde","Teammate","https://img.etimg.com/thumb/width-1600,height-900,imgsize-47368,resizemode-75,msid-104999679/news/sports/when-virat-kohli-battled-depression-his-coach-recalls-the-toughest-phase-of-the-cricketers-career.jpg"))
    list.add(User("Manpreet Gunga","Teammate","https://img.freepik.com/premium-photo/stylish-muslim-boy-with-glorious-punjabi-ai-generated_874192-2505.jpg"))
    list.add(User("Mitesh Naik","Teammate","https://pbs.twimg.com/media/FjU2lkcWYAgNG6d.jpg"))
    list.add(User("Anil Ugale","Team Lead","https://media.licdn.com/dms/image/C5103AQHVvTuNdl3dhQ/profile-displayphoto-shrink_800_800/0/1515848157965?e=2147483647&v=beta&t=lwdjA5WktJHW-ADZ6C2xUFq0oKD4S_m-Lzhd8v_pnRg"))
    list.add(User("Yogesh Despande","Manager","https://vastutathastu.com/wp-content/uploads/photo-gallery/yogesh_desahpande.jpg?bwg=1641553276"))
    list.add(User("Akash Munde","Teammate","https://img.etimg.com/thumb/width-1600,height-900,imgsize-47368,resizemode-75,msid-104999679/news/sports/when-virat-kohli-battled-depression-his-coach-recalls-the-toughest-phase-of-the-cricketers-career.jpg"))
    list.add(User("Manpreet Gunga","Teammate","https://img.freepik.com/premium-photo/stylish-muslim-boy-with-glorious-punjabi-ai-generated_874192-2505.jpg"))
    list.add(User("Mitesh Naik","Teammate","https://pbs.twimg.com/media/FjU2lkcWYAgNG6d.jpg"))

    return list
}