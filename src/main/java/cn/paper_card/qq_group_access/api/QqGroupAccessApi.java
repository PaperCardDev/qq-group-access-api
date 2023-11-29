package cn.paper_card.qq_group_access.api;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public interface QqGroupAccessApi {
    long getMainGroupId();

    long getAuditGroupId();

    @NotNull GroupAccess createMainGroupAccess() throws Exception;

    @NotNull GroupAccess createAuditGroupAccess() throws Exception;
}