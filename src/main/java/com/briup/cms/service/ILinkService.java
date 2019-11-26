package com.briup.cms.service;

import com.briup.cms.bean.LinK;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ILinkService {
    void saveOrUpdateLink(LinK link) throws CustomerException;
    void deleteLink(int id) throws CustomerException;
    LinK queryById(int id) throws CustomerException;
    List<LinK> getAllLink() throws CustomerException;
}
