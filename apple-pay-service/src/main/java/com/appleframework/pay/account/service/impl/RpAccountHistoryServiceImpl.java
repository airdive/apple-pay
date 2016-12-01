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
package com.appleframework.pay.account.service.impl;

import com.appleframework.pay.account.dao.RpAccountHistoryDao;
import com.appleframework.pay.account.entity.RpAccountHistory;
import com.appleframework.pay.account.service.RpAccountHistoryService;
import com.appleframework.pay.common.core.page.PageBean;
import com.appleframework.pay.common.core.page.PageParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 账户历史service实现类
 * http://www.appleframework.com
 * @author：Cruise.Xu
 */
@Service("rpAccountHistoryService")
public class RpAccountHistoryServiceImpl implements RpAccountHistoryService{

	@Autowired
	private RpAccountHistoryDao rpAccountHistoryDao;
	
	@Override
	public void saveData(RpAccountHistory rpAccountHistory) {
		rpAccountHistoryDao.insert(rpAccountHistory);
	}

	@Override
	public void updateData(RpAccountHistory rpAccountHistory) {
		rpAccountHistoryDao.update(rpAccountHistory);
	}

	@Override
	public RpAccountHistory getDataById(String id) {
		return rpAccountHistoryDao.getById(id);
	}

	@Override
	public PageBean<RpAccountHistory> listPage(PageParam pageParam, RpAccountHistory rpAccountHistory) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("accountNo", rpAccountHistory.getAccountNo());
		return rpAccountHistoryDao.listPage(pageParam, paramMap);
	}
}