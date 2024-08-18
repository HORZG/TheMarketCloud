package com.example.themarketcloud.Repositories;
import com.example.themarketcloud.Entity.Users;
import com.jayway.jsonpath.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public  class UserRepositoryImp implements UserRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Users> findAllUsers() {
       return mongoTemplate.findAll(Users.class);
    }

    @Override
    public Users getUserById(String id) {
        return mongoTemplate.findById(id, Users.class);
    }

    @Override
    public Users getUserByName(String name) {
        Query query = new Query();
        query.addCriteria((CriteriaDefinition) Criteria.where("firstName").is(name));
        return mongoTemplate.findOne(query, Users.class);

    }

    @Override
    public void deleteUserById(String id) {
        Query query = new Query();
        query.addCriteria((CriteriaDefinition) Criteria.where("_Id").is(id));
        mongoTemplate.remove(query, Users.class);
    }
}
