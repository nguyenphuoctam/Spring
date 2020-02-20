package com.phuoctam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.phuoctam.entity.BookEntity;
import com.phuoctam.entity.User;
import com.phuoctam.repositories.RepoBook;
import com.phuoctam.services.IBookService;


@Controller
public class HelloWorldController {
	
	@Autowired
	IBookService bookService;
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		List<BookEntity> list = bookService.getListBooks();
		System.out.println("list  : "+list);
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
//	@RequestMapping(value = "/loginResult", method = RequestMethod.POST)
//	public ModelAndView loginResult(@ModelAttribute("SpringWeb") User user) {
//		//repoBook.editBook(book.getId(), book.getTitle(), book.getAuthor(), book.getDescription());
//		if(repoUser.checkUserPass(user)) {
//			return new ModelAndView("redirect:/home");
//		}else {
//			ModelAndView mav = new ModelAndView("login");
//			mav.addObject("loginResult", "false");
//			return mav;
//		}
//	}
//
//	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
//	public ModelAndView addBook() {
//		ModelAndView mav = new ModelAndView("addBook");
//		return mav;
//	}
//
	@RequestMapping("/home")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("home");
		mav.addObject("listBook", bookService.getListBooks());
		return mav;
	}
//
//	@RequestMapping(value = "/addSave", method = RequestMethod.POST)
//	public String addSave(@ModelAttribute("SpringWeb") Book book) {
//		repoBook.addBook(book.getTitle(), book.getAuthor(), book.getDescription());
//		return "redirect:/home";
//		
//
//	}
//	
//	@RequestMapping(value = "/editBook/{id}")
//	public ModelAndView editBook(@PathVariable int id, Model m) {
//
//		ModelAndView mav = new ModelAndView("editBook");
//		mav.addObject("id", id);
//		return mav;
//	}
//
//	@RequestMapping(value = "/editSave", method = RequestMethod.POST)
//	public String editSave(@ModelAttribute("SpringWeb") Book book) {
//		repoBook.editBook(book.getId(), book.getTitle(), book.getAuthor(), book.getDescription());
//		return "redirect:/home";
//	}
//
//	@RequestMapping(value = "descriptionBook/{id}")
//	public ModelAndView descriptionBook(@PathVariable int id, Model m) {
//		Book book = repoBook.findBookId(id);
//		String createdAt = repoBook.changeCalendarToString(book.getCreatedAt());
//		String updatedAt = repoBook.changeCalendarToString(book.getUpdatedAt());
//		ModelAndView mav = new ModelAndView("descriptionBook");
//		mav.addObject("book", book);
//		mav.addObject("createdAt",createdAt);
//		mav.addObject("UpdatedAt",updatedAt);
//		return mav;
//	}

}