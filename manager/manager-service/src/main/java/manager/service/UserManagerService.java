package manager.service;

import common.pojo.PageHelperResult;

public interface UserManagerService {
    PageHelperResult getUserList(int pageNumber, int pageSize);
}
