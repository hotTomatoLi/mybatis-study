drop table if exists USER;
create table USER
(
   ID                   bigint auto_increment not null COMMENT '自增ID',
   USER_ID              varchar(32) not null COMMENT '用户ID',
   USER_NAME            varchar(64) COMMENT '用户名称',
   LOGIN_NAME           varchar(64) COMMENT '登录名称',
   PASSWORD             varchar(128) COMMENT '密码',
   CREATE_TIME          bigint COMMENT '创建时间',
   UPDATE_TIME          bigint COMMENT '更新时间',
   IS_VALIDATED         int COMMENT '是否有效',
   primary key (ID),
   unique(USER_ID)
);


drop table if exists ROLE;
create table ROLE
(
   ID                   bigint auto_increment not null COMMENT '自增ID',
   ROLE_ID              varchar(32) COMMENT '角色ID',
   ROLE_NAME            varchar(64) COMMENT '角色名称',
   CREATE_TIME          bigint COMMENT '创建时间',
   UPDATE_TIME          bigint COMMENT '更新时间',
   IS_VALIDATED         int COMMENT '是否有效',
   primary key (ID),
   unique(ROLE_ID)
);


drop table if exists PRIVILEGE;
create table PRIVILEGE
(
   ID                   bigint auto_increment not null COMMENT '自增ID',
   PRIVILEGE_ID         varchar(32) COMMENT '权限ID',
   PRIVILEGE_NAME       varchar(64) COMMENT '权限名称',
   PRIVILEGE_VALUE      varchar(128) COMMENT '创建值',
   PRIVILEGE_TYPE       varchar(64) COMMENT '权限类别',
   CREATE_TIME          bigint COMMENT '创建时间',
   UPDATE_TIME          bigint COMMENT '更新时间',
   IS_VALIDATED         int COMMENT '是否有效',
   primary key (ID),
   unique(PRIVILEGE_ID)
);


drop table if exists USER_ROLE_REL;
create table USER_ROLE_REL
(
   ID                   bigint auto_increment not null COMMENT '自增ID',
   USER_ID              varchar(32) COMMENT '用户ID',
   ROLE_ID              varchar(32) COMMENT '角色ID',
   CREATE_TIME          bigint COMMENT '创建时间',
   UPDATE_TIME          bigint COMMENT '更新时间',
   IS_VALIDATED         int COMMENT '是否有效',
   primary key (ID),
   unique(USER_ID,ROLE_ID)
);

drop table if exists ROLE_PRIVILEGE_REL;
create table ROLE_PRIVILEGE_REL
(
   ID                   bigint auto_increment not null COMMENT '自增ID',
   ROLE_ID              varchar(32) COMMENT '角色ID',
   PRIVILGE_ID          varchar(32) COMMENT '权限ID',
   CREATE_TIME          bigint COMMENT '创建时间',
   UPDATE_TIME          bigint COMMENT '更新时间',
   IS_VALIDATED         int COMMENT '是否有效',
   primary key (ID),
   unique(ROLE_ID,PRIVILGE_ID)
);
