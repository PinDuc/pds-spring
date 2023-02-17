package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserManager
{
    private List<User> datas = new ArrayList<>();


    public UserManager() {
        datas.add(new User(1, "매플 아이폰 11 pro" , 1500));
        datas.add(new User(2, "매플 아이폰 12 pro" , 1140));
        datas.add(new User(3, "삼성 갤럭시 폴드" , 1220));
        datas.add(new User(4, "lg g9" , 1320));
    }

    public void addUser(User p) {
        p.setId(datas.size() + 1);
        datas.add(p);
    }
    public List<User> getDatas() {
            return datas;
    }

    public User getUser(int id) {
        return datas.get(id -1);
    }

    public void delUser(int id) {
        datas.remove(id -1);
    }

}
