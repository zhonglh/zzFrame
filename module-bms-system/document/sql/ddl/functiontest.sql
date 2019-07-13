drop table IF EXISTS `nodelist`;
create table `nodelist` (
    `id` varchar(11),
    `nodecontent` varchar (300),
    `pid` varchar(11)
); 

insert into `nodelist` (`id`, `nodecontent`, `pid`) values('1','a',NULL);
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('2','b','1');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('3','c','1');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('4','d','2');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('5','e','3');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('6','f','3');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('7','g','5');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('8','h','7');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('9','i','8');
insert into `nodelist` (`id`, `nodecontent`, `pid`) values('10','j','8');


SELECT * FROM nodelist WHERE FIND_IN_SET(id, getChildId(3))