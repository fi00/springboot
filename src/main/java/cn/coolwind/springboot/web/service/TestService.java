package cn.coolwind.springboot.web.service;

import cn.coolwind.springboot.web.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private TestDao testDao;

    public List test() {
        return testDao.findAll();
    }
}
