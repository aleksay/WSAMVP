delete from ESAME_RISTORANTE;
delete from ESAME_MENU;

insert into ESAME_RISTORANTE (id, nome) values (1,'da vito');
insert into ESAME_RISTORANTE (id, nome) values (2,'alessandros pizza');

insert into ESAME_MENU (id,id_RISTORANTE,PIATTO) values (1,1,'pasta al sugo');
insert into ESAME_MENU (id,id_RISTORANTE,PIATTO) values (2,1,'pasta al pesto');
insert into ESAME_MENU (id,id_RISTORANTE,PIATTO) values (3,1,'piatto kebab');

insert into ESAME_MENU (id,id_RISTORANTE,PIATTO) values (4,2,'pizza margherita');
insert into ESAME_MENU (id,id_RISTORANTE,PIATTO) values (5,2,'pizza napoletana');
insert into ESAME_MENU (id,id_RISTORANTE,PIATTO) values (6,2,'quattro formaggi cipolla salsiccia pere sedanini e noci');


--select * from APP.ESAME_RISTORANTE;
