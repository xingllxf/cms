package com.briup.cms.service;

import com.briup.cms.bean.LinK;
import com.briup.cms.exception.CustomerException;

public interface ILinkService {
    void addLink(LinK link) throws CustomerException;
}
