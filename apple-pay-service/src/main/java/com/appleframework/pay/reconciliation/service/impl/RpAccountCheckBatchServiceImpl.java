/*
 * Copyright 2015-2102 RonCoo(http://www.appleframework.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.appleframework.pay.reconciliation.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appleframework.pay.common.core.page.PageBean;
import com.appleframework.pay.common.core.page.PageParam;
import com.appleframework.pay.reconciliation.dao.RpAccountCheckBatchDao;
import com.appleframework.pay.reconciliation.entity.RpAccountCheckBatch;
import com.appleframework.pay.reconciliation.service.RpAccountCheckBatchService;

/**
 * 对账批次接口实现 .
 * 
 * http://www.appleframework.com
 * 
 * @author  Cruise.Xu
 */
@Service("rpAccountCheckBatchService")
public class RpAccountCheckBatchServiceImpl implements RpAccountCheckBatchService {

	@Autowired
	private RpAccountCheckBatchDao rpAccountCheckBatchDao;

	@Override
	public void saveData(RpAccountCheckBatch rpAccountCheckBatch) {
		rpAccountCheckBatchDao.insert(rpAccountCheckBatch);
	}

	@Override
	public void updateData(RpAccountCheckBatch rpAccountCheckBatch) {
		rpAccountCheckBatchDao.update(rpAccountCheckBatch);
	}

	@Override
	public RpAccountCheckBatch getDataById(String id) {
		return rpAccountCheckBatchDao.getById(id);
	}

	@Override
	public PageBean listPage(PageParam pageParam, Map<String, Object> paramMap) {

		return rpAccountCheckBatchDao.listPage(pageParam, paramMap);
	}

	/**
	 * 根据条件查询实体
	 * 
	 * @param paramMap
	 */
	public List<RpAccountCheckBatch> listBy(Map<String, Object> paramMap) {
		return rpAccountCheckBatchDao.listBy(paramMap);
	}

}