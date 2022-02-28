package app.tamba.auth.bus;

import app.tamba.auth.models.Blog;

import java.util.List;

import java.util.Map;

public interface BlogBus {

Blog creatBlog (Map<String, Object> map);

Blog updateBlog (Long blogid, Map<String, Object> map);

List<Blog> readBlogs();

Blog readBlogs(Long blogid);
}