<!DOCTYPE html>
<html lang="en">

<head>
  <title>VEGAN FOOD</title>
  <meta property="og:title" content="Elliptical Partial Hare" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta charset="utf-8" />
  <meta property="twitter:card" content="summary_large_image" />

  <style data-tag="reset-style-sheet">
    html {
      line-height: 1.15;
    }

    body {
      margin: 0;
    }

    * {
      box-sizing: border-box;
      border-width: 0;
      border-style: solid;
    }

    p,
    li,
    ul,
    pre,
    div,
    h1,
    h2,
    h3,
    h4,
    h5,
    h6,
    figure,
    blockquote,
    figcaption {
      margin: 0;
      padding: 0;
    }

    button {
      background-color: transparent;
    }

    button,
    input,
    optgroup,
    select,
    textarea {
      font-family: inherit;
      font-size: 100%;
      line-height: 1.15;
      margin: 0;
    }

    button,
    select {
      text-transform: none;
    }

    button,
    [type="button"],
    [type="reset"],
    [type="submit"] {
      -webkit-appearance: button;
    }

    button::-moz-focus-inner,
    [type="button"]::-moz-focus-inner,
    [type="reset"]::-moz-focus-inner,
    [type="submit"]::-moz-focus-inner {
      border-style: none;
      padding: 0;
    }

    button:-moz-focus,
    [type="button"]:-moz-focus,
    [type="reset"]:-moz-focus,
    [type="submit"]:-moz-focus {
      outline: 1px dotted ButtonText;
    }

    a {
      color: inherit;
      text-decoration: inherit;
    }

    input {
      padding: 2px 4px;
    }

    img {
      display: block;
    }

    html {
      scroll-behavior: smooth
    }

    .home-container3 {
      display: flex;
      justify-content: space-around;
    }

    .gallery-card3-gallery-card {
      width: 30%;
      height: 400px;
      display: flex;
      position: relative;
      align-items: center;
      flex-direction: column;
      justify-content: center;
    }

    .gallery-card3-image {
      top: 0;
      left: 0;
      right: auto;
      width: 100%;
      bottom: auto;
      height: 300px;
      position: absolute;
      object-fit: cover;
      border-radius: 8px;
      /* Adjust the radius as needed */
    }

    .gallery-card3-image+figcaption {
      position: absolute;
      bottom: 0;
      background: rgba(0, 0, 0, 0.7);
      color: white;
      padding: 10px;
      width: 100%;
      box-sizing: border-box;
      text-align: center;
    }
  </style>
  <style data-tag="default-style-sheet">
    html {
      font-family: Inter;
      font-size: 16px;
    }

    body {
      font-weight: 400;
      font-style: normal;
      text-decoration: none;
      text-transform: none;
      letter-spacing: normal;
      line-height: 1.15;
      color: var(--dl-color-gray-black);
      background-color: var(--dl-color-gray-white);

    }
  </style>
  <link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Inter:wght@100;200;300;400;500;600;700;800;900&amp;display=swap"
    data-tag="font" />
  <link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&amp;display=swap"
    data-tag="font" />
  <link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Lato:ital,wght@0,100;0,300;0,400;0,700;0,900;1,100;1,300;1,400;1,700;1,900&amp;display=swap"
    data-tag="font" />
  <style>
    @keyframes fade-in-left {
      0% {
        opacity: 0;
        transform: translateX(-20px);
      }

      100% {
        opacity: 1;
        transform: translateX(0);
      }
    }
  </style>
  <script>
    document.addEventListener("DOMContentLoaded", function () {

      const username = "<?php session_start();
      echo isset($_SESSION['username']) ? $_SESSION['username'] : ''; ?>";

      if (username) {

        document.querySelector('.home-register.button').textContent = username;
      }
    });
  </script>
</head>

<body>
  <link rel="stylesheet" href="./style.css" />
  <div>
    <link href="./index.css" rel="stylesheet" />

    <div class="home-container">
      <div class="home-header">
        <header data-thq="thq-navbar" class="home-navbar-interactive">
          <span class="home-logo">VEGAN FOOD</span>
          <div data-thq="thq-navbar-nav" class="home-desktop-menu">
            <nav class="home-links">
              <a href="#n1"><span class="home-nav1">Home</span></a>
              <a href="#n2"><span class="home-nav2">Menus</span></a>
              <a href="order.html"><span class="home-nav4">Order</span></a>
              <a href="contact.html"><span class="home-nav5">Contact</span></a>
            </nav>
            <div class="home-buttons">
              <button class="home-register button">username</button>
            </div>
          </div>
          <div data-thq="thq-burger-menu" class="home-burger-menu">
            <svg viewBox="0 0 1024 1024" class="home-icon">
              <path
                d="M128 554.667h768c23.552 0 42.667-19.115 42.667-42.667s-19.115-42.667-42.667-42.667h-768c-23.552 0-42.667 19.115-42.667 42.667s19.115 42.667 42.667 42.667zM128 298.667h768c23.552 0 42.667-19.115 42.667-42.667s-19.115-42.667-42.667-42.667h-768c-23.552 0-42.667 19.115-42.667 42.667s19.115 42.667 42.667 42.667zM128 810.667h768c23.552 0 42.667-19.115 42.667-42.667s-19.115-42.667-42.667-42.667h-768c-23.552 0-42.667 19.115-42.667 42.667s19.115 42.667 42.667 42.667z">
              </path>
            </svg>
          </div>
          <div data-thq="thq-mobile-menu" class="home-mobile-menu">
            <div class="home-nav">
              <div class="home-top">
                <span class="home-logo1">VEGAN FOOD</span>
                <div data-thq="thq-close-menu" class="home-close-menu">
                  <svg viewBox="0 0 1024 1024" class="home-icon02">
                    <path
                      d="M810 274l-238 238 238 238-60 60-238-238-238 238-60-60 238-238-238-238 60-60 238 238 238-238z">
                    </path>
                  </svg>
                </div>
              </div>
              <nav class="home-links1">
                <a href="#n1"><span class="home-nav11">Home</span></a>
                <a href="#n2"><span class="home-nav21">Menus</span></a>
                <a href="order.html"><span class="home-nav41">Order</span></a>
                <a href="contact.html"><span class="home-nav51">Contact</span></a>
              </nav>
              <div class="home-buttons1">
                <button class="home-register1 button">username</button>
              </div>
            </div>
            <div>
              <svg viewBox="0 0 950.8571428571428 1024" class="home-icon04">
                <path
                  d="M925.714 233.143c-25.143 36.571-56.571 69.143-92.571 95.429 0.571 8 0.571 16 0.571 24 0 244-185.714 525.143-525.143 525.143-104.571 0-201.714-30.286-283.429-82.857 14.857 1.714 29.143 2.286 44.571 2.286 86.286 0 165.714-29.143 229.143-78.857-81.143-1.714-149.143-54.857-172.571-128 11.429 1.714 22.857 2.857 34.857 2.857 16.571 0 33.143-2.286 48.571-6.286-84.571-17.143-148-91.429-148-181.143v-2.286c24.571 13.714 53.143 22.286 83.429 23.429-49.714-33.143-82.286-89.714-82.286-153.714 0-34.286 9.143-65.714 25.143-93.143 90.857 112 227.429 185.143 380.571 193.143-2.857-13.714-4.571-28-4.571-42.286 0-101.714 82.286-184.571 184.571-184.571 53.143 0 101.143 22.286 134.857 58.286 41.714-8 81.714-23.429 117.143-44.571-13.714 42.857-42.857 78.857-81.143 101.714 37.143-4 73.143-14.286 106.286-28.571z">
                </path>
              </svg>
              <svg viewBox="0 0 877.7142857142857 1024" class="home-icon06">
                <path
                  d="M585.143 512c0-80.571-65.714-146.286-146.286-146.286s-146.286 65.714-146.286 146.286 65.714 146.286 146.286 146.286 146.286-65.714 146.286-146.286zM664 512c0 124.571-100.571 225.143-225.143 225.143s-225.143-100.571-225.143-225.143 100.571-225.143 225.143-225.143 225.143 100.571 225.143 225.143zM725.714 277.714c0 29.143-23.429 52.571-52.571 52.571s-52.571-23.429-52.571-52.571 23.429-52.571 52.571-52.571 52.571 23.429 52.571 52.571zM438.857 152c-64 0-201.143-5.143-258.857 17.714-20 8-34.857 17.714-50.286 33.143s-25.143 30.286-33.143 50.286c-22.857 57.714-17.714 194.857-17.714 258.857s-5.143 201.143 17.714 258.857c8 20 17.714 34.857 33.143 50.286s30.286 25.143 50.286 33.143c57.714 22.857 194.857 17.714 258.857 17.714s201.143 5.143 258.857-17.714c20-8 34.857-17.714 50.286-33.143s25.143-30.286 33.143-50.286c22.857-57.714 17.714-194.857 17.714-258.857s5.143-201.143-17.714-258.857c-8-20-17.714-34.857-33.143-50.286s-30.286-25.143-50.286-33.143c-57.714-22.857-194.857-17.714-258.857-17.714zM877.714 512c0 60.571 0.571 120.571-2.857 181.143-3.429 70.286-19.429 132.571-70.857 184s-113.714 67.429-184 70.857c-60.571 3.429-120.571 2.857-181.143 2.857s-120.571 0.571-181.143-2.857c-70.286-3.429-132.571-19.429-184-70.857s-67.429-113.714-70.857-184c-3.429-60.571-2.857-120.571-2.857-181.143s-0.571-120.571 2.857-181.143c3.429-70.286 19.429-132.571 70.857-184s113.714-67.429 184-70.857c60.571-3.429 120.571-2.857 181.143-2.857s120.571-0.571 181.143 2.857c70.286 3.429 132.571 19.429 184 70.857s67.429 113.714 70.857 184c3.429 60.571 2.857 120.571 2.857 181.143z">
                </path>
              </svg>
              <svg viewBox="0 0 602.2582857142856 1024" class="home-icon08">
                <path
                  d="M548 6.857v150.857h-89.714c-70.286 0-83.429 33.714-83.429 82.286v108h167.429l-22.286 169.143h-145.143v433.714h-174.857v-433.714h-145.714v-169.143h145.714v-124.571c0-144.571 88.571-223.429 217.714-223.429 61.714 0 114.857 4.571 130.286 6.857z">
                </path>
              </svg>
            </div>
          </div>
        </header>
      </div>
      <div class="home-hero">
        <div class="home-hero1">
          <div class="home-container1">
            <h1 class="home-hero-heading heading1">
              FlavourFiesta: Dive into the World of Desi Vegan Delicacies
            </h1>
            <span class="home-hero-sub-heading">
              "Savor the vibrant symphony of flavors in every bite, as our
              vegan dishes redefine culinary delight."
            </span>
            <div class="home-btn-group">
              <a href="#n1"><button class="home-hero-button1 button">Get Started</button></a>
              <a href="#n3"><button class="home-hero-button2 button">
                  Order food&nbsp;→
                </button></a>
            </div>
          </div>
        </div>
      </div>
      <div class="home-details" id="n1">
        <div class="home-details1">
          <div class="home-container2">
            <span class="home-text sectionTitle">
              <span>Details</span>
              <br />
            </span>
            <h2 class="home-details-heading heading2">WHY VEGAN FOOD ?</h2>
            <span class="home-details-sub-heading">
              <span class="home-text03">
                Health Benefits: Lower risk of heart disease, diabetes, and
                certain cancers with a plant-based diet.
              </span>
              <br class="home-text04" />
              <br class="home-text05" />
              <span class="home-text06">
                Environmental Impact: Plant-based diets often have a smaller
                ecological footprint than meat-based diets.
              </span>
              <br class="home-text07" />
              <br class="home-text08" />
              <span class="home-text09">
                Ethical Concerns: Avoidance of animal cruelty and concerns
                about the treatment of animals in the meat industry.
              </span>
              <br class="home-text10" />
              <br class="home-text11" />
              <span class="home-text12">
                Weight Management: Plant-based diets can contribute to weight
                control due to lower calorie and saturated fat intake.
              </span>
              <br class="home-text13" />
              <br class="home-text14" />
              <span class="home-text15">
                Digestive Health: Higher fiber content in plant-based diets
                supports better digestion.
              </span>
            </span>
          </div>
          <img alt="image"
            src="data:image/jpeg;base64,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"
            class="home-details-image" />
        </div>
      </div>
      <div class="home-features" id="n2"></div>
      <div class="home-pricing"></div>
      <div class="home-gallery">
        <div class="home-gallery1">
          <h1 class="home-gallery-heading heading2">
            Delicious Vegan foods
          </h1>
          <span class="home-gallery-sub-heading">
            Explore our mouthwatering collection of vegan dishes
          </span>
          <div class="home-container3">
            <div class="gallery-card3-gallery-card gallery-card3-root-class-name0">
              <img alt="image" src="blazePizza.jpg" class="gallery-card3-image" />
              <figcaption>blaze Pizza - 150 rupee </figcaption>
            </div>

            <div class="gallery-card3-gallery-card gallery-card3-root-class-name1">
              <img alt="image" src="plntBurger.jpg" class="gallery-card3-image" />
              <figcaption>Plant Burger - 200 rupee </figcaption>
            </div>

            <div class="gallery-card3-gallery-card gallery-card3-root-class-name2">
              <img alt="image" src="sandwich.jpg" class="gallery-card3-image" />
              <figcaption>Sandwich - 100 rupee </figcaption>
            </div>

            <div class="gallery-card3-gallery-card gallery-card3-root-class-name3">
              <img alt="image" src="tofu.jpg" class="gallery-card3-image" />
              <figcaption>Tofu Dish - 250 rupee </figcaption>
            </div>

            <div class="gallery-card3-gallery-card gallery-card3-root-class-name4">
              <img alt="image" src="vegan noodle.jpg" class="gallery-card3-image" />
              <figcaption>Vegan Noodle - 180 rupee </figcaption>
            </div>

            <div class="gallery-card3-gallery-card gallery-card3-root-class-name5">
              <img alt="image" src="vegan pizza.jpg" class="gallery-card3-image" />
              <figcaption>Vegan Pizza - 70 rupee </figcaption>
            </div>

            <div class="gallery-card3-gallery-card gallery-card3-root-class-name6">
              <img alt="image" src="vegan-pasta.jpg" class="gallery-card3-image" />
              <figcaption>Vegan Pasta - 90 rupee </figcaption>
            </div>

            <div class="gallery-card3-gallery-card gallery-card3-root-class-name7">
              <img alt="image" src="veganBurger.jpg" class="gallery-card3-image" />
              <figcaption>Vegan Burger - 60 rupee </figcaption>
            </div>

          </div>

        </div>
      </div>
      <div class="home-banner" id="n3">
        <div class="home-banner1">
          <h1 class="home-banner-heading heading2">
            "Order Now: Elevate Your Plate with Our Delectable Vegan
            Creations!"
          </h1>
          <span class="home-banner-sub-heading">
            "Deliciously crafted, freshly prepared, and delivered to your
            doorstep – experience the convenience of wholesome vegan
            meals with just a click."
          </span>
          <a href="order.html"><button class="home-banner-button button">order food</button></a>
        </div>
      </div>
      <div class="home-faq"></div>
      <div class="home-footer">
        <footer class="home-footer1">
          <div class="home-container4">
            <span class="home-logo2">VEGAN FOOD</span>
            <nav class="home-nav1">
              <a href="#n1"><span class="home-nav12">Home</span></a>
              <a href="#n2"><span class="home-nav22">Menus</span></a>
              <a href="order.html"><span class="home-nav42">order</span></a>
              <a href="contact.html"><span class="home-nav52">Contact</span></a>
            </nav>
          </div>
          <div class="home-separator"></div>
          <div class="home-container5">
            <span class="home-text16">
              © 2023 myCompany, All Rights Reserved.
            </span>
            <div class="home-icon-group1">
              <svg viewBox="0 0 950.8571428571428 1024" class="home-icon10">
                <path
                  d="M925.714 233.143c-25.143 36.571-56.571 69.143-92.571 95.429 0.571 8 0.571 16 0.571 24 0 244-185.714 525.143-525.143 525.143-104.571 0-201.714-30.286-283.429-82.857 14.857 1.714 29.143 2.286 44.571 2.286 86.286 0 165.714-29.143 229.143-78.857-81.143-1.714-149.143-54.857-172.571-128 11.429 1.714 22.857 2.857 34.857 2.857 16.571 0 33.143-2.286 48.571-6.286-84.571-17.143-148-91.429-148-181.143v-2.286c24.571 13.714 53.143 22.286 83.429 23.429-49.714-33.143-82.286-89.714-82.286-153.714 0-34.286 9.143-65.714 25.143-93.143 90.857 112 227.429 185.143 380.571 193.143-2.857-13.714-4.571-28-4.571-42.286 0-101.714 82.286-184.571 184.571-184.571 53.143 0 101.143 22.286 134.857 58.286 41.714-8 81.714-23.429 117.143-44.571-13.714 42.857-42.857 78.857-81.143 101.714 37.143-4 73.143-14.286 106.286-28.571z">
                </path>
              </svg><svg viewBox="0 0 877.7142857142857 1024" class="home-icon12">
                <path
                  d="M585.143 512c0-80.571-65.714-146.286-146.286-146.286s-146.286 65.714-146.286 146.286 65.714 146.286 146.286 146.286 146.286-65.714 146.286-146.286zM664 512c0 124.571-100.571 225.143-225.143 225.143s-225.143-100.571-225.143-225.143 100.571-225.143 225.143-225.143 225.143 100.571 225.143 225.143zM725.714 277.714c0 29.143-23.429 52.571-52.571 52.571s-52.571-23.429-52.571-52.571 23.429-52.571 52.571-52.571 52.571 23.429 52.571 52.571zM438.857 152c-64 0-201.143-5.143-258.857 17.714-20 8-34.857 17.714-50.286 33.143s-25.143 30.286-33.143 50.286c-22.857 57.714-17.714 194.857-17.714 258.857s-5.143 201.143 17.714 258.857c8 20 17.714 34.857 33.143 50.286s30.286 25.143 50.286 33.143c57.714 22.857 194.857 17.714 258.857 17.714s201.143 5.143 258.857-17.714c20-8 34.857-17.714 50.286-33.143s25.143-30.286 33.143-50.286c22.857-57.714 17.714-194.857 17.714-258.857s5.143-201.143-17.714-258.857c-8-20-17.714-34.857-33.143-50.286s-30.286-25.143-50.286-33.143c-57.714-22.857-194.857-17.714-258.857-17.714zM877.714 512c0 60.571 0.571 120.571-2.857 181.143-3.429 70.286-19.429 132.571-70.857 184s-113.714 67.429-184 70.857c-60.571 3.429-120.571 2.857-181.143 2.857s-120.571 0.571-181.143-2.857c-70.286-3.429-132.571-19.429-184-70.857s-67.429-113.714-70.857-184c-3.429-60.571-2.857-120.571-2.857-181.143s-0.571-120.571 2.857-181.143c3.429-70.286 19.429-132.571 70.857-184s113.714-67.429 184-70.857c60.571-3.429 120.571-2.857 181.143-2.857s120.571-0.571 181.143 2.857c70.286 3.429 132.571 19.429 184 70.857s67.429 113.714 70.857 184c3.429 60.571 2.857 120.571 2.857 181.143z">
                </path>
              </svg><svg viewBox="0 0 602.2582857142856 1024" class="home-icon14">
                <path
                  d="M548 6.857v150.857h-89.714c-70.286 0-83.429 33.714-83.429 82.286v108h167.429l-22.286 169.143h-145.143v433.714h-174.857v-433.714h-145.714v-169.143h145.714v-124.571c0-144.571 88.571-223.429 217.714-223.429 61.714 0 114.857 4.571 130.286 6.857z">
                </path>
              </svg>
            </div>
          </div>
        </footer>
      </div>
    </div>
  </div>
  <script data-section-id="navbar" src="https://unpkg.com/@teleporthq/teleport-custom-scripts"></script>
</body>

</html>