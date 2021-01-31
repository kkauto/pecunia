package com.pecunia.repository;

import com.pecunia.entity.UserAccount;
import org.springframework.stereotype.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface  AccountRepository extends JpaRepository <UserAccount,Integer> {
	List<UserAccount> findByName(String name);
	UserAccount findById(int id);
}
