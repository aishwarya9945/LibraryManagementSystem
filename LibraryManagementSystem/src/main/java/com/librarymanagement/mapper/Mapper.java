package com.librarymanagement.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.librarymanagement.entity.Author;
import com.librarymanagement.entity.Book;
import com.librarymanagement.entity.Borrower;
import com.librarymanagement.entity.Category;
import com.librarymanagement.entity.Publisher;
import com.librarymanagement.vo.AuthorRecord;
import com.librarymanagement.vo.BookRecord;
import com.librarymanagement.vo.BorrowerRecord;
import com.librarymanagement.vo.CategoryRecord;
import com.librarymanagement.vo.PublisherRecord;

public class Mapper {

	public static List<BookRecord> bookModelToVo(List<Book> books) {

		return books.stream().map(vo -> {
			var bookVo = new BookRecord(vo.getId(), vo.getIsbn(), vo.getName(), vo.getSerialName(),
					vo.getDescription());
			return bookVo;
		}).collect(Collectors.toList());
	}

	public static List<AuthorRecord> authorModelToVo(List<Author> authors) {

		return authors.stream().map(vo -> {
			var authorVo = new AuthorRecord(vo.getId(), vo.getName(), vo.getDescription());
			return authorVo;
		}).collect(Collectors.toList());

	}

	public static List<CategoryRecord> categoryModelToVo(List<Category> categories) {

		return categories.stream().map(vo -> {
			var categoryVo = new CategoryRecord(vo.getId(), vo.getName());
			return categoryVo;
		}).collect(Collectors.toList());

	}

	public static List<PublisherRecord> publisherModelToVo(List<Publisher> publishers) {

		return publishers.stream().map(vo -> {
			var publisherVo = new PublisherRecord(vo.getId(), vo.getName());
			return publisherVo;
		}).collect(Collectors.toList());

	}
	
	
		public static List<BorrowerRecord> borrowerModelToVo(List<Borrower> borrowers) {


		return borrowers.stream().map(vo -> {
			var borrowerVo = new BorrowerRecord(vo.getId(), vo.getName());
			return borrowerVo;
		}).collect(Collectors.toList());

	}


}