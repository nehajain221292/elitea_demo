import { test, expect } from '@playwright/test';

test('Navigate to Myntra and verify Men T-Shirts', async ({ page }) => {
  // Navigate to Myntra website
  await page.goto('https://www.myntra.com/');

  // Select "Men" from the header menu
  await page.click('a[href="/shop/men"]');

  // Click the "T-Shirts" link
  await page.click('a[href="/men-tshirts"]');

  // Verify that the "Men T-Shirts" text is visible on the page
  const menTShirtsText = await page.locator('text=Men T-Shirts');
  await expect(menTShirtsText).toBeVisible();
});