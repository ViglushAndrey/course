/*let page = document.querySelector('.page');
let themeButton = document.querySelector('.theme-button');
themeButton.onclick = function() {
    page.classList.toggle('light-theme');
    page.classList.toggle('dark-theme');
};*/

let message = document.querySelector('.subscription-message');
let form = document.querySelector('.subscription');
// Объявите переменную здесь

form.onsubmit = function(evt) {
    evt.preventDefault();
    // Измените значение textContent на следующей строке
    message.textContent = 'Форма отправлена!';
};