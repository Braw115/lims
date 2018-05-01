/*
SQLyog Ultimate v11.33 (64 bit)
MySQL - 5.7.17 : Database - lims
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lims` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `lims`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `cid` char(10) NOT NULL COMMENT '课程号',
  `cname` varchar(10) DEFAULT NULL COMMENT '课程名',
  `cdept` varchar(20) DEFAULT NULL COMMENT '所属实验室',
  `cinfo` varchar(50) DEFAULT NULL COMMENT '课程描述',
  `count` int(11) DEFAULT NULL COMMENT '已选课人数',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

insert  into `course`(`cid`,`cname`,`cdept`,`cinfo`,`count`) values ('dm3306','计算机网络','多媒体课程','周四7.8节',25),('dm6379','C语言','多媒体课程','周三 5.6节',30),('hx5432','有机反应','化学实验课程','周三7.8节',20),('sw4396','显微镜使用','生物实验课程','周一1.2节',20),('wl2341','电磁感应','物理实验课程','周五3.4节',13),('wl8080','数字电路','物理实验课程','周四7.8节',16),('yx9527','解剖学','医学实验课程','周二5.6节',15);

/*Table structure for table `dev` */

DROP TABLE IF EXISTS `dev`;

CREATE TABLE `dev` (
  `dev_num` char(10) NOT NULL COMMENT '设备编号',
  `dev_name` varchar(20) DEFAULT NULL COMMENT '设备名称',
  `dev_attribute` varchar(10) DEFAULT NULL COMMENT '设备所属',
  `dev_status` int(11) DEFAULT NULL COMMENT '设备状态',
  PRIMARY KEY (`dev_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `dev` */

insert  into `dev`(`dev_num`,`dev_name`,`dev_attribute`,`dev_status`) values ('0001','思科路由器','计算机网络实验室',1),('0002','游标卡尺','力学实验室',0);

/*Table structure for table `lab` */

DROP TABLE IF EXISTS `lab`;

CREATE TABLE `lab` (
  `lab_num` char(10) NOT NULL,
  `lab_name` varchar(20) DEFAULT NULL,
  `lab_catagroy` char(20) DEFAULT NULL,
  `lab_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`lab_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `lab` */

insert  into `lab`(`lab_num`,`lab_name`,`lab_catagroy`,`lab_status`) values ('1001','电学实验室','物理',0),('1002','有机反应实验室','化学',1),('1004','力学实验室','物理',0),('1005','微生物实验室','生物',0);

/*Table structure for table `material` */

DROP TABLE IF EXISTS `material`;

CREATE TABLE `material` (
  `mat_num` char(10) NOT NULL COMMENT '耗材编号',
  `mat_name` varchar(20) DEFAULT NULL COMMENT '耗材名称',
  `mat_attribute` varchar(20) DEFAULT NULL COMMENT '耗材所属',
  `mat_remain` double DEFAULT NULL COMMENT '耗材余量',
  PRIMARY KEY (`mat_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `material` */

insert  into `material`(`mat_num`,`mat_name`,`mat_attribute`,`mat_remain`) values ('0001','盐酸','无机化学实验室',1000);

/*Table structure for table `notice` */

DROP TABLE IF EXISTS `notice`;

CREATE TABLE `notice` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `content` text,
  `announce_data` date DEFAULT NULL,
  `announce_dept` char(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `notice` */

insert  into `notice`(`id`,`title`,`content`,`announce_data`,`announce_dept`) values (6,'教务处公告','<p>教务处公告</p>','2018-05-01','教务处'),(7,'物理实验重修报名','<p>物理实验重修报名时间：下周二截至</p>','2018-05-01','物理实验室'),(8,'生物实验调课通知','<p>本周三课调至下周二</p>','2018-05-01','生物实验室'),(9,'化学实验考试通知','<p>化学实验考试时间5.20</p>','2018-05-01','化学实验室');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `sid` char(10) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `sname` varchar(10) DEFAULT NULL,
  `ssex` char(10) DEFAULT NULL,
  `sage` int(10) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`sid`,`password`,`sname`,`ssex`,`sage`) values ('0001','123','张三','男',20),('0003','123','王五','男',23),('0005','123','令狐冲','女',20),('0009','123','张三峰','男',20),('0011','123','张无忌','男',21);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `tid` char(10) NOT NULL,
  `password` varchar(10) DEFAULT NULL,
  `tname` varchar(10) DEFAULT NULL,
  `tsex` char(10) DEFAULT NULL,
  `tage` int(11) DEFAULT NULL,
  `jobTitle` int(11) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`tid`,`password`,`tname`,`tsex`,`tage`,`jobTitle`) values ('0002','123','李四','女',28,2);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` char(10) NOT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role` int(5) DEFAULT NULL COMMENT '''0''代表教师 ''1''代表学生',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`uid`,`password`,`role`) values ('0001','123',0),('0002','123',1),('0005','123',0),('0009','123',0),('0011','123',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
