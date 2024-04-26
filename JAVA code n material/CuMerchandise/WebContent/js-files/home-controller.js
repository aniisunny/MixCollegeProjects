//getComputedStyle(document.querySelector('.imgSlider')).backgroundImage 
var slides = document.querySelector('.slider-items').children;
var prevSlide = document.querySelector('.prev');
var nextSlide = document.querySelector('.next');

var numOfSlide = slides.length;

var index = 0;



nextSlide.onclick = function () {
    next("next");
}
prevSlide.onclick = function () {
    next("prev");
}

function next(direction) {
    if (direction == "next") {
        index++;
        if (index == numOfSlide)
            index = 0;
    } else {
        index--;
        if (index == -1)
            index = numOfSlide-1;
    }
    for (var i = 0; i < numOfSlide; i++)
        slides[i].classList.remove("active");

    slides[index].classList.add("active");
}

