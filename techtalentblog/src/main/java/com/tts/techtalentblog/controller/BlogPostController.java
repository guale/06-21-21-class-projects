package com.tts.techtalentblog.controller;

import com.tts.techtalentblog.model.BlogPost;
import com.tts.techtalentblog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BlogPostController {

	@Autowired
	private BlogPostRepository blogPostRepository;
//	private static List<BlogPost> posts = new ArrayList<>();

	@GetMapping("/")
	public String index (BlogPost blogPost, Model model){
		model.addAttribute("posts", blogPostRepository.findAll());
		return "blogpost/index";
	}

	@PostMapping("/blogposts")
	public String addNewBlogPost(BlogPost blogPost, Model model) {
		blogPostRepository.save(blogPost);
		model.addAttribute("title", blogPost.getTitle());
		model.addAttribute("author",blogPost.getAuthor());
		model.addAttribute("blogEntry", blogPost.getBlogEntry());
		return "blogpost/result";
	}

	@GetMapping("/blogposts/new")
	public String newBlog(BlogPost blogPost){
		return "blogpost/new";
	}

	@GetMapping("/blogpost/{id}")
	public String editPostById(@PathVariable Long id, BlogPost blogPost, Model model){
		model.addAttribute("blogPost", blogPostRepository.findById(id).orElseThrow());
		return "blogpost/edit";
	}

	@GetMapping("/blogposts/update/{id}")
	public String updateExistingPost(@PathVariable Long id, BlogPost blogPost, Model model){
		var actualPost = blogPostRepository.findById(id).orElseThrow();
		actualPost.setAuthor(blogPost.getAuthor());
		actualPost.setTitle(blogPost.getTitle());
		actualPost.setBlogEntry(blogPost.getBlogEntry());
		blogPostRepository.save(actualPost);
		model.addAttribute("blogpost", actualPost);
		return "blogpost/result";
	}

	@DeleteMapping("/blogposts/{id}")
	public String deletePostByID(@PathVariable Long id, BlogPost blogpost){
		blogPostRepository.deleteById(id);
		return "blogpost/delete";
	}

}
