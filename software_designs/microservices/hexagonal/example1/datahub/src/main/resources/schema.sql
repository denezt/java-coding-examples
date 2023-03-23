/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  denezt
 * Created: Mar 17, 2023
 */


-- -- Adding a course table
create table users
(
    id bigint not null,
    firstname varchar(255) not null,
    lastname varchar(255) not null,
    account_status int not null,
    primary key(id)
);