package com.springboot.springbootjpa.repository;

import com.springboot.springbootjpa.models.db.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * Update a user status by his id
     * @param id
     */
    @Transactional
    @Modifying
    @Query("UPDATE User u set u.status = 2 where u.id = :id")
    void updateStatus(@Param("id") int id);

    /**
     * Update user roleId
     * @param id Id of the User
     * @param roleId Id of the Role
     */
    @Transactional
    @Modifying
    @Query("UPDATE User u set u.role_id = :roleId where u.id = :id AND u.status = 1")
    void updateRoleId(int id, int roleId);
}
