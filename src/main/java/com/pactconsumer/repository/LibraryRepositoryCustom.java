package com.pactconsumer.repository;

import java.util.List;

import com.pactconsumer.controller.Library;

public interface LibraryRepositoryCustom {
	
	List<Library> findAllByAuthor(String authorName);

	Library findByName(String bookName);

}
