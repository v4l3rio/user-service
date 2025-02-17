package user

import User
import UserData

/**
 * Service interface for managing User entities.
 */
interface UserService {

    /**
     * Creates a new user.
     * @param user the user to create
     * @return the created user
     */
    fun createUser(user: User): User

    /**
     * Retrieves a user by their ID.
     * @param userId the ID of the user to retrieve
     * @return the user with the given ID, or null if no user found
     */
    fun getUser(userId: String): UserData?

    /**
     * Updates an existing user.
     * @param userId the ID of the user to update
     * @param user the user data to update
     * @return the updated user, or null if the user does not exist
     */
    fun updateUser(userId: String, user: User): User?

    /**
     * Deletes a user by their ID.
     * @param userId the ID of the user to delete
     * @return true if the user was deleted, false otherwise
     */
    fun deleteUser(userId: String): Boolean

    /**
     * Get User by email.
     * @param email the email of the user to retrieve
     * @return the user with the given email, or null if no user found
     */
    fun getUserByEmail(email: String): UserData?
}
