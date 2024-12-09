
function addObserverToElement(elementSelector, visibleClass) {
    const element = document.querySelector(elementSelector);
    if (!element) return;

    const observer = new IntersectionObserver(entries => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                element.classList.add(visibleClass);
            } else {
                element.classList.remove(visibleClass);
            }
        });
    });

    observer.observe(element);
}

// Aplica el observador a las secciones

addObserverToElement('.contenedor', 'visible');
addObserverToElement('.centrado', 'visible');
addObserverToElement('header', 'visible');
addObserverToElement('.footer-content', 'visible');