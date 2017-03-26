package edu.infsci2560.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import edu.infsci2560.models.Friend;

public interface FriendRepository extends CrudRepository<Friend, Long>{
	
	List<Friend> findByPetName(String petName);
}
