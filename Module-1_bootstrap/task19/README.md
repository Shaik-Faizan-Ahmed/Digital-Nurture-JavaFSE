# Task 19 — Bootstrap 5 Customisation with Sass

## Exercise 19.1 — Project Setup with npm + Sass

### Prerequisites
- [Node.js](https://nodejs.org/) (v18 or later recommended)

### Steps

```bash
# 1. Initialise an npm project (inside this task19 folder)
npm init -y

# 2. Install Bootstrap source files
npm install bootstrap

# 3. Install the Sass compiler as a dev dependency
npm install sass --save-dev

# 4. Compile the custom Sass file to CSS
npx sass _custom.scss dist/custom.css

# (Optional) Watch for changes automatically
npx sass --watch _custom.scss dist/custom.css
```

After compiling, link the output in your HTML:
```html
<!-- Replace the Bootstrap CDN link with your compiled file -->
<link rel="stylesheet" href="dist/custom.css">
```

---

## Exercise 19.2 — Customising Variables in `_custom.scss`

Open `_custom.scss`. The key overrides are:

| Variable | Default | Custom value |
|---|---|---|
| `$primary` | `#0d6efd` (blue) | `#6f42c1` (purple) |
| `$border-radius` | `0.375rem` | `0.75rem` |
| `$border-radius-sm` | `0.25rem` | `0.5rem` |
| `$border-radius-lg` | `0.5rem` | `1rem` |

> **Important:** Variable overrides must be placed **before** `@import "bootstrap"`.  
> Bootstrap's variables use `!default`, which means they only take effect when not already set.

### Recompile after changes
```bash
npx sass _custom.scss dist/custom.css --style compressed
```

---

## Folder Structure
```
task19/
├── _custom.scss        ← Sass source with variable overrides + Bootstrap import
├── index.html          ← Demo page (simulates compiled output via inline CSS)
├── README.md           ← This file
└── dist/
    └── custom.css      ← Generated after running the compile command above
```
