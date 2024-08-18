package com.example.themarketcloud.Repositories;

import com.example.themarketcloud.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long>, UserRepositoryCustom {

}
