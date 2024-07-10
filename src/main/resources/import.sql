-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into casa(nome) values ('FIEMS');
insert into casa(nome) values ('SESI');
insert into casa(nome) values ('IEL');
insert into casa(nome) values ('SENAI');

insert into especializacao(nome) values ('professor');
insert into especializacao(nome) values ('técnico');
insert into especializacao(nome) values ('engenheiro');

insert into registro(nome, cpf, email, telefone, especializacao_id, casa_id)
values ('joão silva Gonçalves', '00000000000','joão.goncalves@ms.fiems.br','67995857545',3,1);