document.addEventListener("DOMContentLoaded", function () {
  var typingText = document.querySelector(".typing-text");
  typingText.classList.add("typing-active");

  const homeButton = document.getElementById("home-button");
  const homeButton1 = document.getElementById("home-button-1");
  const aboutButton = document.getElementById("about-button");
  const aboutButton1 = document.getElementById("about-button-1");
  const projectsButton = document.getElementById("projects-button");
  const projectsButton1 = document.getElementById("projects-button-1");
  const socialLinksButton = document.getElementById("social-links-button");
  const socialLinksButton1 = document.getElementById("social-links-button-1");
  const contactButton = document.getElementById("contact-section-button");
  const contactButton1 = document.getElementById("contact-section-button-1");

  const homeSection = document.getElementById("home-section");
  const aboutSection = document.getElementById("about-section");
  const projectsSection = document.getElementById("projects-section");
  const socialLinksSection = document.getElementById("social-links-section");
  const contactSection = document.getElementById("contact-section");

  homeButton.addEventListener("click", function () {
    homeSection.style.display = "block";
    aboutSection.style.display = "none";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "none";
  });

  aboutButton.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "block";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "none";
  });

  projectsButton.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "none";
    projectsSection.style.display = "block";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "none";
  });

  socialLinksButton.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "none";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "block";
    contactSection.style.display = "none";
  });

  contactButton.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "none";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "block";
  });

  homeButton1.addEventListener("click", function () {
    homeSection.style.display = "block";
    aboutSection.style.display = "none";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "none";
  });

  aboutButton1.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "block";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "none";
  });

  projectsButton1.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "none";
    projectsSection.style.display = "block";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "none";
  });

  socialLinksButton1.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "none";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "block";
    contactSection.style.display = "none";
  });

  contactButton1.addEventListener("click", function () {
    homeSection.style.display = "none";
    aboutSection.style.display = "none";
    projectsSection.style.display = "none";
    socialLinksSection.style.display = "none";
    contactSection.style.display = "block";
  });

  let clickCount = 0;

  const downArrowButton = document.getElementById("down-arrow");

  const sectionsLink = document.getElementById("sections-link-id");

  downArrowButton.addEventListener("click", function () {
    clickCount++;

    if (clickCount % 2 === 0) {
      sectionsLink.style.display = "block";
    } else {
      sectionsLink.style.display = "none";
    }
  });
});
