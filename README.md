# Homework 7 - Эмуляция ресторана
### Описание задания
Необходимо эмулировать работу ресторана. Есть два типа действующих лиц:
- официант
- посетитель

Официант принимает заказы и приносит блюда
Посетитель делает заказ и ест, когда ему этот заказ приносит.

Посетители должны уходить сытыми, а официанты не должны заставлять ждать посетителей (то есть официанты не отдыхают).

Предполагается 2 официанта и 10 посетителей, которые приходят раз в секунду

Попробуйте найти здесь владельцев критической секции, изменения системы и кто от них зависит. В качестве результата ожидается многопоточное приложение с применением синхронизации.
