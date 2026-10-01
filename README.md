# 图书管理系统

> 项目来源：B站视频【AI干实战项目】基于 SpringBoot3 + Vue3 的图书管理系统 BV15hmTBwEnS

## 一、项目是做什么的

这是一个前后端分离的图书管理系统，主要给图书馆管理员使用。

管理员登录后，可以：

- 管理用户和权限
- 新增、修改、删除、查询图书
- 管理图书分类
- 办理图书借阅和归还
- 分页展示列表数据

前端负责页面展示，后端提供 REST 接口，数据保存到 MySQL。

## 二、技术栈

### 后端

- Java 17
- Spring Boot 3.x
- MyBatis-Plus
- MySQL 8.0
- Sa-Token：登录鉴权
- Maven

### 前端

- Vue 3
- Element Plus
- Axios

## 三、主要功能

1. 用户管理：管理员登录、身份和权限校验
2. 图书管理：新增、编辑、删除、分页条件查询图书
3. 图书分类管理：维护图书类别
4. 借阅管理：图书借阅、归还
5. 分页：全部列表业务支持分页

## 四、目录结构

```text
src/main/java
├── controller        // 接口层，接收前端请求
├── service           // 业务逻辑层
├── mapper            // 数据库 Mapper 接口
├── entity            // 实体类
├── config            // 配置类，例如 Sa-Token 配置
└── util              // 工具类
```

## 五、部署运行

### 1. 准备环境

先安装：

- JDK 17
- Maven
- MySQL 8.0
- Node.js

### 2. 初始化数据库

1. 在 MySQL 中新建数据库
2. 导入项目提供的 SQL 脚本
3. 确认表结构创建成功

### 3. 启动后端

1. 打开 `application.yml`
2. 修改数据库连接信息：地址、账号、密码
3. 启动 Spring Boot 后端服务

### 4. 启动前端

进入前端 Vue 项目目录：

```bash
npm install
npm run dev
```

### 5. 访问系统

浏览器打开前端启动后提示的地址，通常是：

```text
http://localhost:5173
```

然后使用管理员账号登录操作。

## 六、Git 提交规范

- `feat:` 新增功能
- `fix:` 修复 bug
- `chore:` 修改配置、文档等
- `refactor:` 代码重构

## 七、说明

- GitHub 仓库名：`pamadmin`，保持不变。
- 简历中的项目名称写：**图书管理系统**。