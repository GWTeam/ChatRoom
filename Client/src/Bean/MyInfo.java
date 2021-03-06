/**
 * @Author hurray
 * @Part 
 * @Note 
 * @Encoding UTF-8 
 * @link Expression link is undefined on line 6, column 12 in Templates/Classes/Class.java. 
 * @Date 2014-11-04 08:22:01
 * @Copyright Hurray@BUPT
 * @MainPage http://www.ihurray.com
 * 
 */

package Bean;

//共有库
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

//私有库
import Bean.FriendInfo;
import Bean.GroupInfo;
/**
 * @Author hurray
 * @Class MyInfo
 */
public class MyInfo {
    private String ID;
    private String name;
    private ImageIcon picture;
    private int status;
    private List friendList;
    private List groupList;
    
    public MyInfo (String test) {
       friendList  = new ArrayList();
       groupList = new ArrayList();
       FriendInfo aNewFriend = new FriendInfo();
       aNewFriend.setName("二翔");
       aNewFriend.setID("125125");
       aNewFriend.setPictureUrl("Image/fr_picture.png"); 
       friendList.add(aNewFriend);
       
       GroupInfo aNewGroup = new GroupInfo();
       aNewGroup.setGroupID("233333");
       aNewGroup.setGroupName("我是群名");
       groupList.add(aNewGroup);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getPicture() {
        return picture;
    }

    public void setPicture(ImageIcon picture) {
        this.picture = picture;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public void setFriendList(String jsonFriendList) {
        
    }
    
    public List getFriendList() {
        return friendList;
    }
    
    public void setGroupList(String jsonGroupList) {
    
    }
    
    public List getGroupList() {
        return groupList;
    }
}