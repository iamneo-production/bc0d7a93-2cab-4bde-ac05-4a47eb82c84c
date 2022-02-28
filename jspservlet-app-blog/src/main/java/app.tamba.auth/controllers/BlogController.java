package app.tamba.auth.controllers;
import app.tamba.auth.bus.BlogBus;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation. annotation. Validated;

import org.springframework.web.bind. annotation. RequestMapping;

import org.springframework.web.bind. annotation. RestController;

@RestController

@validated

@RequestHapping ("/")

public class BlogController {

private final BlogBus blogbus;

@Autowired

public BlogController (BlogBus blogBus){
    this.blogBus = blogbus;
}

@PostMapping (value = {"blog"})

public Callable<Blog> createBlog( @Valid @RequestBody Map<String, Object> map){

return () -> blogBus.createBlog(map);

}

@GetMapping (value = ("blog"})

public Callable<List<Blog>> readBlogs ()
{

return ()-> blogBus.readBlogs();

}

@PutMapping (value = ("blog/{blogId)")

public Callable<Blog> updateBlog(

@valid @Pathvariable @Positive (message="Id must be positive number.") Long blogid,

@Valid @RequestBody Map<String, Object> map)
{

return () -> blogBus.updateBlogs, map);


}

@GetMapping(value = {("blog/{blogId}"})

public Callable<Blog > updateBlog(

@valid @PathVariable @Positive (message = "Id must be positive number.") Long blogid)
{
return () -> blogbus.readBlog(blogId);
}
}