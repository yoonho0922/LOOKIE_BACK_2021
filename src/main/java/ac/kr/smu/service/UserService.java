package ac.kr.smu.service;

import ac.kr.smu.vo.UserVO;

public interface UserService {
    public void save(UserVO userVO);
    public boolean checkEmailDuplication(String email);
}
