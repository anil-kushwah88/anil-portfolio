(function () {
  // Typing effect (roles come from Java via data-roles)
  var el = document.getElementById("ty");
  if (el) {
    var T = (el.dataset.roles || "").split("|"), ti = 0, ci = 0, del = false;
    (function tp() {
      var w = T[ti];
      el.textContent = w.slice(0, del ? --ci : ++ci);
      var s = del ? 40 : 80;
      if (!del && ci === w.length) { del = true; s = 1500; }
      else if (del && ci === 0) { del = false; ti = (ti + 1) % T.length; s = 300; }
      setTimeout(tp, s);
    })();
  }

  // Scroll reveal
  var io = new IntersectionObserver(function (entries) {
    entries.forEach(function (x) {
      if (x.isIntersecting) { x.target.classList.add("in"); io.unobserve(x.target); }
    });
  }, { threshold: 0.12 });
  document.querySelectorAll(".rv").forEach(function (n, i) {
    n.style.transitionDelay = (i % 4) * 80 + "ms";
    io.observe(n);
  });

  // 3D tilt on cards
  document.querySelectorAll(".card").forEach(function (c) {
    c.addEventListener("mousemove", function (e) {
      var r = c.getBoundingClientRect(),
          x = (e.clientX - r.left) / r.width - 0.5,
          y = (e.clientY - r.top) / r.height - 0.5;
      c.style.transform = "perspective(700px) rotateY(" + x * 7 + "deg) rotateX(" + -y * 7 + "deg) translateY(-3px)";
    });
    c.addEventListener("mouseleave", function () { c.style.transform = ""; });
  });

  // Scroll progress bar
  var bar = document.getElementById("bar");
  addEventListener("scroll", function () {
    var h = document.documentElement;
    bar.style.width = (h.scrollTop / (h.scrollHeight - h.clientHeight) * 100) + "%";
  });
})();
