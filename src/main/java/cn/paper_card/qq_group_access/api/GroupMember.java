package cn.paper_card.qq_group_access.api;

@SuppressWarnings("unused")
public interface GroupMember {

    long getQq(); // QQ 号码

    String getNick(); // 昵称

    String getNameCard(); // 群名片

    String getSpecialTitle(); // 群头衔

    int getJoinTime(); // 入群时间

    int getActiveLevel(); // 活跃等级

    int getPermissionLevel(); // 权限等级

    int getQLevel(); // QQ等级

    void kick(String message) throws Exception;
}
