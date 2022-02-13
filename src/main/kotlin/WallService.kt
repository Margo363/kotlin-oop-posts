class WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = posts.size)
        return posts.last()
    }

    fun update(post: Post): Boolean {

        for((index, post) in posts.withIndex()) {
            var id = null
            if(post.id == id) {
                val nextPost = post.copy(id = post.id, date = post.date)
                posts[index] = nextPost
                return true
            }
        }
        return false
    }
}
