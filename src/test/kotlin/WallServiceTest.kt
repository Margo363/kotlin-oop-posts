import org.junit.Assert.*

class WallServiceTest() {

    @org.junit.Test
    fun addNotNull() {
        val service = WallService()
        service.add (Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1642008004, text = "Netology_1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 0, postType = "post_1", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 1))
        service.add (Post(id = 2, ownerId = 2, fromId = 2, createdBy = 2, date = 1642246581, text = "Netology_2",
            replyOwnerId = 2, replyPostId = 2, friendsOnly = 0, postType = "post_2", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 2))
        service.add (Post(id = 3, ownerId = 3, fromId = 3, createdBy = 3, date = 1642467707, text = "Netology_3",
            replyOwnerId = 3, replyPostId = 3, friendsOnly = 0, postType = "post-3", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 3))

        val add = Post(id = 4, ownerId = 4, fromId = 4, createdBy = 4, date = 1642514515, text = "Netology_4",
            replyOwnerId = 4, replyPostId = 4, friendsOnly = 0, postType = "post_4", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 4)

        val result = add.id


        assertNotNull(result)

    }

    @org.junit.Test
    fun updateExisting() {
        val service = WallService()
        service.update (Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1642008004, text = "Netology_1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 0, postType = "post_1", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 1))
        service.update (Post(id = 2, ownerId = 2, fromId = 2, createdBy = 2, date = 1642246581, text = "Netology_2",
            replyOwnerId = 2, replyPostId = 2, friendsOnly = 0, postType = "post_2", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 2))
        service.update (Post(id = 3, ownerId = 3, fromId = 3, createdBy = 3, date = 1642467707, text = "Netology_3",
            replyOwnerId = 3, replyPostId = 3, friendsOnly = 0, postType = "post-3", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 3))

        val update = Post(id = 4, ownerId = 4, fromId = 4, createdBy = 4, date = 1642514515, text = "Netology_4",
            replyOwnerId = 4, replyPostId = 4, friendsOnly = 0, postType = "post_4", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 4)

        val result = service.update(update)
        assertTrue(result)
    }

    @org.junit.Test
    fun updateNonExisting() {
        val service = WallService()
        service.update (Post(id = 1, ownerId = 1, fromId = 1, createdBy = 1, date = 1642008004, text = "Netology_1",
            replyOwnerId = 1, replyPostId = 1, friendsOnly = 0, postType = "post_1", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 1))
        service.update (Post(id = 2, ownerId = 2, fromId = 2, createdBy = 2, date = 1642246581, text = "Netology_2",
            replyOwnerId = 2, replyPostId = 2, friendsOnly = 0, postType = "post_2", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 2))
        service.update (Post(id = 3, ownerId = 3, fromId = 3, createdBy = 3, date = 1642467707, text = "Netology_3",
            replyOwnerId = 3, replyPostId = 3, friendsOnly = 0, postType = "post-3", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 3))

        val update = Post(id = 4, ownerId = 4, fromId = 4, createdBy = 4, date = 1642514515, text = "Netology_4",
            replyOwnerId = 4, replyPostId = 4, friendsOnly = 0, postType = "post_4", signerId = 1,
            canPin = false, canDelete = false, canEdit = false, isPinned = 0, markedAsAds = false,
            isFavorite = false, postponedId = 4)

        val result = service.update(update)

        assertFalse(result)
    }
}