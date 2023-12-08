package com.example.ecom.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

/**
 * @author nitesh
 */
@Component
public class DbUtil {

    private static MongoTemplate mongoTemplate;

    private MongoTemplate mongoTemplateService;

    @Autowired
    private DbUtil(MongoTemplate mongoTemplateService) {
        mongoTemplate = mongoTemplateService;
    }

    public static <T> List<T> getAllEntities(Class<T> clazz, Map<String, Object> queryParams) {
        Query query = new Query();
        if (!CollectionUtils.isEmpty(queryParams)) {
            for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
                query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
            }
        }
        return mongoTemplate.find(query, clazz);
    }

    public static <T> List<T> getAllEntities(Class<T> clazz) {
        return mongoTemplate.findAll(clazz);
    }

    public static <T> T getOne(Class<T> clazz, Map<String, Object> queryParams) {
        Query query = new Query();
        if (!CollectionUtils.isEmpty(queryParams)) {
            for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
                query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
            }
        }
        return mongoTemplate.findOne(query, clazz);
    }

    public static <T> void insert(T entity) {
        if (entity == null) {
            throw new IllegalArgumentException("Null Entity to save");
        }
        mongoTemplate.save(entity);
    }

    public static <T> void delete(Class<T> clazz, Map<String, Object> queryParams) {
        if (clazz == null) {
            throw new IllegalArgumentException("Null Entity to delete");
        }
        Query query = new Query();
        if (!CollectionUtils.isEmpty(queryParams)) {
            for (Map.Entry<String, Object> entry : queryParams.entrySet()) {
                query.addCriteria(Criteria.where(entry.getKey()).is(entry.getValue()));
            }
        }
        mongoTemplate.remove(query, clazz);
    }
}
