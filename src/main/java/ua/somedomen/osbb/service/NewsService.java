package ua.somedomen.osbb.service;

import ua.somedomen.osbb.entity.News;

import java.util.List;

public interface NewsService {

//    void addNewsComment(News news);

    List<News> findALL();

    News findOne(int id);

    News save(News news);

    void delete(int id);
}