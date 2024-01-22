package cn.paper_card.qq_group_access.api;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("unused")
public interface GroupAccess {

    long getId();

    boolean hasMember(long qq) throws Exception;

    void setGroupMemberRemark(long qq, @NotNull String remark) throws Exception;

    void sendNormalMessage(@NotNull String message) throws Exception;

    void sendAtMessage(long qq, @NotNull String message) throws Exception;

    void sendAtMessage(@NotNull List<Long> qqs, @NotNull String message) throws Exception;

    void setMute(long qq, int seconds) throws Exception;

    @NotNull GroupMember getMember(long qq) throws Exception;

    @NotNull List<GroupMember> getAllMembers() throws Exception;
}
