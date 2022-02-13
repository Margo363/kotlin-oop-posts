import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    val post = Post(id = 0, ownerId = 0, fromId = 0, createdBy = 0, date = 0, text = "textPost0",
        replyOwnerId = 0, replyPostId = 0, friendsOnly = 0, comments = Comments(0,false,
            false, false, false), copyright = Copyright(0, "", "",""),
        likes = Likes(0, false, false, false), reposts = Reposts(0,
            false), views = Views(0),signerId = 0, canPin = false, canDelete = false,
        canEdit = false, isPinned = 0, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 0
    )

    @Test
    fun testAdd() {
        //Arrange

        val service = WallService()

        service.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1, text = "textPost1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 1, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 1, canPin = false, canDelete = false,
            canEdit = false, isPinned = 1, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 1))

        val add = Post(id = 2, ownerId = 2, fromId = 2, createdBy = 2, date = 2, text = "textPost2",
            replyOwnerId = 2, replyPostId = 2, friendsOnly = 2, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 2, canPin = false, canDelete = false,
            canEdit = false, isPinned = 2, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 2)

        val result = service.add(add)

        assertNotNull(result)
    }

    @Test
    fun testUpdateTrue() {

        val service = WallService()

        service.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1, text = "textPost1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 1, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 1, canPin = false, canDelete = false,
            canEdit = false, isPinned = 1, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 1))

        service.add(Post(id = 2, ownerId = 2, fromId = 2, createdBy = 2, date = 2, text = "textPost2",
            replyOwnerId = 2, replyPostId = 2, friendsOnly = 2, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 2, canPin = false, canDelete = false,
            canEdit = false, isPinned = 2, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 2))


        val update = Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1, text = "textPost1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 1, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 1, canPin = false, canDelete = false,
            canEdit = false, isPinned = 1, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 1)

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun testUpdateFalse() {

        val service = WallService()

        service.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1, text = "textPost1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 1, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 1, canPin = false, canDelete = false,
            canEdit = false, isPinned = 1, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 1))

        service.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1, text = "textPost1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 1, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 1, canPin = false, canDelete = false,
            canEdit = false, isPinned = 1, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 1))

        val update = Post(id = 2, ownerId = 2, fromId = 2, createdBy = 2, date = 2, text = "textPost2",
            replyOwnerId = 2, replyPostId = 2, friendsOnly = 2, comments = Comments(0,false,
                false, false, false), copyright = Copyright(0, "", "",""),
            likes = Likes(0, false, false, false), reposts = Reposts(0,
                false), views = Views(0),signerId = 2, canPin = false, canDelete = false,
            canEdit = false, isPinned = 2, markedAsAds = false, isFavorite = false, donut = Donut(), postponedId = 2)


        val result = service.update(update)

        assertFalse(result)
    }
}
