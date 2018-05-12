package manager.service;

import com.github.pagehelper.PageInfo;

public interface UserManagerService {
    PageInfo getUserList(int pageNum, int pageSize);

    void userDelect(int userid);
}
