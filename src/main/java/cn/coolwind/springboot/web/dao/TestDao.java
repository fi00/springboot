package cn.coolwind.springboot.web.dao;

import cn.coolwind.springboot.web.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends JpaRepository<Test,Long> {
}
