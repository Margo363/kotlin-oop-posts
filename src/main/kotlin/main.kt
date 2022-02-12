
fun main () {
    var post = Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1642008004, text = "Netology_1",
        replyOwnerId = 1, replyPostId = 1, friendsOnly = 0, postType = "post_1", signerId = 1,
        canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
        isFavorite = false, postponedId = 1)
}
//val post = "post"
//val copy = "copy"
//val reply = "reply"
//val postpone = "postpone"
//val suggest = "suggest"
//val textPost = "Netology post"

data class Post(var id: Int, val ownerId: Int, val fromId: Int, val createdBy: Int, val date: Int, val text: String,
           val replyOwnerId: Int, val replyPostId: Int, val friendsOnly: Int, val postType: String, val signerId: Int,
           val canPin: Boolean, val canDelete: Boolean, val canEdit: Boolean, val isPinned: Int, val markedAsAds: Boolean,
           val isFavorite: Boolean, val postponedId: Int)
{
    class Comments(val count: Int, val canPost: Boolean, val groupsCanPost: Boolean, val canClose: Boolean, val canOpen: Boolean)
    class Copyright(val id: Int, link: String, name: String, type: String)
    class Likes(val count: Int, val userLikes: Boolean, val canLike: Boolean, val canPublish: Boolean)
    class Reposts(val count: Int, val userReposted: Boolean)
    class Views(val count: Int)
    class Donut(val isDonut: Boolean, val paidDuration: Int, val canPublishFreeCopy: Boolean, val editMode: String)
}

class WallService {
    open var posts = emptyArray<Post>()

    fun add(post: Post, id: Int): Post { // метод для создания записи
        TODO()

        posts += post
        for ((index) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(id = post.id +1)
            }
        }
        return post
    }

    fun update(post: Post, id: Int): Boolean { // метод для обновления записи
        TODO()

        for ((index) in posts.withIndex()) {
            when {
                post.id == id -> posts[index] = post.copy(post.ownerId, post.date)
                else -> false
            }
        }
        return true
    }
}

//    val id: Int = 0, // id записи
//    val ownerId: Int = 0, // id владельца стены (toId)
//    val fromId: Int = 0, // id автора записи
//    val createdBy: Int = 0, //id администратора, кот-й опубликовал запись
//    val date: Int = 0, //время публикации записи в формате unixtime
//    val text: String = textPost, // текст записи
//    val replyOwnerId: Int = 0, // id владельца записи, в ответ на которую была оставлена текущая
//    val replyPostId: Int = 0, // id записи, в ответ на которую была оставлена текущая
//    val friendsOnly: Int = 0, // 1, если запись была создана с опцией "Только для друзей"
//    val postType: String = post, // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
//    val signerId: Int = 0, // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
//    val canPin: Boolean = false, // Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
//    val canDelete: Boolean = false, // Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может)
//    val canEdit: Boolean = false, // Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
//    val isPinned: Int = 0, // Информация о том, что запись закреплена
//    val markedAsAds: Boolean = false, // Информация о том, содержит ли запись отметку «реклама» (1 — да, 0 — нет)
//    val isFavorite: Boolean = false, // true, если объект добавлен в закладки у текущего пользователя
//    val postponedId: Int = 0, // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
//) //{

    //  val comments = Comments (0, true, true, true, true),  // информация о комментариях к записи, объект с полями
    //  val copyright = Copyright, //источник материала, объект с полями
    //  var likes = Likes, // Информация о лайках к записи, объект с полями
    //  val reposts = Reposts, //Информация о репостах записи («Рассказать друзьям»), объект с полями
    //  val views = Views, // Информация о просмотрах записи. Объект с единственным полем
    //  val donut = Donut() // Информация о записи VK Donut

//    class Comments(val count: Int, val canPost: Boolean, val groupsCanPost: Boolean, val canClose: Boolean, val canOpen: Boolean)
//    class Copyright(val id: Int, link: String, name: String, type: String)
//    class Likes(val count: Int, val userLikes: Boolean, val canLike: Boolean, val canPublish: Boolean)
//    class Reposts(val count: Int, val userReposted: Boolean)
//    class Views(val count: Int)
//    class Donut(val isDonut: Boolean, val paidDuration: Int, val canPublishFreeCopy: Boolean, val editMode: String)
//
//    init{ println ("")
    //}
//}


//object WallService {
//    private var posts = emptyArray<Post>()
//}
