package edu.infsci2560.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.infsci2560.models.Friend;

public interface FriendRepository extends PagingAndSortingRepository<Friend, Long>{}
