import app.tamba.auth.models. Blog;

import org.springframework.stereotype. Service;

import java.util.List;

import java.util.Map;

@Service

public class BlogBusImpl implements BlogBus {

private final BlogRepository blogRepository;

@Autowired

 public BlogBusImpl (Blogepository blogRepository) {
     
     this.blogRepository = blogRepository;
     
 }
@Override

public Blog createBlog (Mapestring, Object> map) {

var blng new Blog();

blog.setTitle (map.get("title").tostring());

blog.setDescription (nap.get("description").tostring());

blog.setIsPublished (true);

blog.setCreatedon(Date.volueof(LocalDate.now())); 

return blogiepository.save(blog);
}
@Override

public Blog updateBlog (Long blogid, Map<String, Object> map) { Blog blog redBlog(blogId);
{

blog.setTitle(sup.get("title").toString());

blog.setDescription (nap.get(description ).tostring());

return blogiepository.save(blog);
}

@Override

public List<Blog> readBlogs() {


return blogkepository.findAllByIsPublished (true);

}

@Override

public Blog readBlog(Long blogid) {

Optional<Blog> blogoptional blogkapository.findlyId(blogid);

Blog blog blogoptional.orElseThrow()-> RecordNotFoundException ("Blog not found"));

return blog;
}
}

