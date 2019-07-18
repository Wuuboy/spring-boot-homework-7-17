alter table  procurator add constraint CK_Age check(age >18);
alter table  procurator add constraint CK_Sex check(sex = '男' or sex = '女');
alter table  procurator add constraint CK_Experience check(experience >0);