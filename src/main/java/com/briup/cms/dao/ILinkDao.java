package com.briup.cms.dao;



import com.briup.cms.bean.LinK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILinkDao extends JpaRepository<LinK,Integer> {
LinK queryById(int id);
}
