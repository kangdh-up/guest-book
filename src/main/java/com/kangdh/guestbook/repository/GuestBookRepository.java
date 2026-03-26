package com.kangdh.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kangdh.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook,Integer>{

}
